package btrace_demo;

import org.openjdk.btrace.core.BTraceUtils;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;

@BTrace
public class BtracerUnsafeTestDemo {
    @OnMethod(
            clazz = "UnsafeTest",
            method = "/.*/"
    )

    public static void traceCacheBlock() {
        BTraceUtils.println("Who call UnsafeTest methods :");
        BTraceUtils.jstack();
    }
}