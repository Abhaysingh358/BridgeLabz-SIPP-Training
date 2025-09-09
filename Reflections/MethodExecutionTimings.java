package Reflections;

import java.lang.reflect.*;

class TaskRunner {
    public void fastTask() throws InterruptedException {
        Thread.sleep(100); // simulate work
        System.out.println("Fast task done");
    }

    public void slowTask() throws InterruptedException {
        Thread.sleep(500); // simulate work
        System.out.println("Slow task done");
    }
}

public class MethodExecutionTimings {
    public static void main(String[] args) throws Exception {
        TaskRunner runner = new TaskRunner();
        Class<?> clazz = runner.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            long start = System.nanoTime();
            method.invoke(runner);
            long end = System.nanoTime();

            System.out.println(method.getName() + " executed in " + (end - start) / 1_000_000 + " ms");
        }
    }
}

