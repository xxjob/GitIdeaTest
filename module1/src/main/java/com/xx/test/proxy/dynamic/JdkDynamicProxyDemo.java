package com.xx.test.proxy.dynamic;

import com.xx.test.proxy.stat.DefaultEchoService;
import com.xx.test.proxy.stat.EchoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyDemo {

    public static void main(String[] args) {
        // 当前线程的类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // $Proxy0
        Object proxy = Proxy.newProxyInstance(classLoader, new Class[]{EchoService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (EchoService.class.isAssignableFrom(method.getDeclaringClass())) {
                    // 被代理对象
                    EchoService echoService = new DefaultEchoService();
                    long startTime = System.currentTimeMillis();
                    String result = echoService.echo((String) args[0]);
                    long costTime = System.currentTimeMillis() - startTime;
                    System.out.println("echo 方法执行的实现：" + costTime + " ms.");
                    return result;
                }
                return null;
            }
        });
        EchoService echoService = (EchoService) proxy;
        echoService.echo("Hello,World");
    }
}