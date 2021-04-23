package com.xx.test.proxy.stat;

public class StaticProxyDemo {

    public static void main(String[] args) {
        // 创建代理类，并传入被代理对象，也就是 DefaultEchoService
        EchoService echoService = new ProxyEchoService(new DefaultEchoService());
        echoService.echo("Hello,World");
    }
}