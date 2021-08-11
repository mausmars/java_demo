package btrace_demo;

import com.sun.btrace.annotations.BTrace;

import static com.sun.btrace.BTraceUtils.*;

import com.sun.btrace.annotations.*;

@BTrace
public class BtracerDemo {
    @OnMethod(
            clazz = "java.util.zip.Inflater",
            method = "/.*/"
    )

    public static void traceCacheBlock() {
        println("Who call java.util.zip.Inflater's methods :");
        jstack();
    }
}