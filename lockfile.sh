

!#bin/bash
function my_lockfile ()
{
        TEMPFILE="$1.$$"
        LOCKFILE="$1.lock"
        echo $$ > $TEMPFILE 2>/dev/null || {
                echo "You don't have permission to access `dirname $TEMPFILE`"
                return 1
        }
        ln $TEMPFILE $LOCKFILE 2>/dev/null && {
                rm -f $TEMPFILE
                return 0
        }
        STALE_PID=`< $LOCKFILE`
        test "$STALE_PID" -gt "0" >/dev/null || {
                return 1
        }
        kill -0 $STALE_PID 2>/dev/null && {
                rm -f $TEMPFILE
                return 1
        }
        rm $LOCKFILE 2>/dev/null && {
            echo "Removed stale lock file of process $STALE_PID"
        }
        ln $TEMPFILE $LOCKFILE 2>/dev/null && {
                rm -f $TEMPFILE
                return 0
        }
        rm -f $TEMPFILE
        return 1
}
