package cn.iamding.drpc.server.rpc.disk;

/**
 * @author XuDing
 * @date 2018/4/30
 */
interface ExceptionalSupplier<T> {
    T supply() throws Exception;
}
