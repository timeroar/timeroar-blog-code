package com.timeroar.test.codec;

import io.netty.handler.codec.marshalling.*;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshalling;
import org.jboss.marshalling.MarshallingConfiguration;

/**
 * <p>MarshallingCodeCfactory</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/5/16 13:31
 */
public final class MarshallingCodeCfactory {

    private static final String NAME = "serial"; // serial表⽰创建的是 Java序列化⼯⼚对象.由jboss-marshalling-serial提供
    private static final Integer VERSION = 5;
    private static final Integer MAX_OBJECT_SIZE = 1024 * 1024 * 5;

    /**
     * 创建Jboss Marshalling 解码器 MarshallingDecoder
     *
     * @return
     */
    public static MarshallingDecoder buildMarshallingDecoder() {
        //首先通过Marshalling 工具类的静态方法获取Marshalling实例对象，参数serial标识创建的是java序列化工厂对象
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory(NAME);
        //创建 MarshallingConfiguration对象，配置了版本号为5
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(VERSION);
        //根据MarshallerFactory和MarshallingConfiguration 创建 provider
        UnmarshallerProvider provider = new DefaultUnmarshallerProvider(marshallerFactory, configuration);
        //构建Netty的MarshallingDecoder对象，两个参数分别是provider和单个消息序列化后的最大长度
        MarshallingDecoder decoder = new MarshallingDecoder(provider, MAX_OBJECT_SIZE);

        return decoder;
    }

    /**
     * 创建Jboss Marshalling 编码器 MarshallingEncoder
     *
     * @return
     */
    public static MarshallingEncoder buildMarshallingEecoder() {
        //首先通过Marshalling 工具类的静态方法获取Marshalling实例对象，参数serial标识创建的是java序列化工厂对象
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("serial");
        //创建 MarshallingConfiguration对象，配置了版本号为5
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(5);
        //根据MarshallerFactory和MarshallingConfiguration 创建 provider
        MarshallerProvider provider = new DefaultMarshallerProvider(marshallerFactory, configuration);
        //构建Netty的MarshallingEncoder对象，MarshallingEncoder用于实现序列化接口的POJO对象序列化为二进制数组
        MarshallingEncoder encoder = new MarshallingEncoder(provider);

        return encoder;
    }
}
