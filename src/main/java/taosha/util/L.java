package taosha.util;

import android.util.Log;

import java.util.Arrays;

public final class L {
    private L() {
    }


    private static int l(int priority, String tag, String message, Object... args) {
        if (args.length == 0) {
            return Log.println(priority, tag, message);
        } else if (args[0] instanceof Throwable) {
            return Log.println(priority, tag, message + "\n" + Log.getStackTraceString((Throwable) args[0]));
        } else {
            return Log.println(priority, tag, String.format(message, args));
        }
    }

    public static int a(String tag, String message, Object... args) {
        return l(Log.DEBUG, tag, message, args);
    }

    public static int a(String tag, Object... args) {
        return a(tag, Arrays.toString(args));
    }

    public static int v(String tag, String message, Object... args) {
        return Log.isLoggable(tag, Log.VERBOSE) ? l(Log.VERBOSE, tag, message, args) : 0;
    }

    public static int v(String tag, Object... args) {
        return v(tag, Arrays.toString(args));
    }

    public static int d(String tag, String message, Object... args) {
        return Log.isLoggable(tag, Log.DEBUG) ? l(Log.DEBUG, tag, message, args) : 0;
    }

    public static int d(String tag, Object... args) {
        return d(tag, Arrays.toString(args));
    }

    public static int i(String tag, String message, Object... args) {
        return Log.isLoggable(tag, Log.INFO) ? l(Log.INFO, tag, message, args) : 0;
    }

    public static int i(String tag, Object... args) {
        return i(tag, Arrays.toString(args));
    }

    public static int w(String tag, String message, Object... args) {
        return Log.isLoggable(tag, Log.WARN) ? l(Log.WARN, tag, message, args) : 0;
    }

    public static int w(String tag, Object... args) {
        return w(tag, Arrays.toString(args));
    }

    public static int e(String tag, String message, Object... args) {
        return Log.isLoggable(tag, Log.ERROR) ? l(Log.ERROR, tag, message, args) : 0;
    }

    public static int e(String tag, Object... args) {
        return e(tag, Arrays.toString(args));
    }

    public static int f(String tag, String message, Object... args) {
        return Log.isLoggable(tag, Log.ASSERT) ? l(Log.ASSERT, tag, message, args) : 0;
    }

    public static int f(String tag, Object... args) {
        return f(tag, Arrays.toString(args));
    }
}
