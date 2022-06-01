import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        LoadingCache<String,String> cache = CacheBuilder.newBuilder()
                .maximumSize(1)//缓存最大个数
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) {
                        try {
                            System.out.println("加载数据");
                            return String.valueOf(System.currentTimeMillis());
                        }
                        catch (Exception e){
                            return " ";
                        }
                    }
                });
        cache.put("1",String.valueOf(System.currentTimeMillis()));
        int i = 1;
        while(true){
            System.out.println("第" + i + "秒获取到的数据为：" + cache.get("a"));
            i++;
            Thread.sleep(1000);
        }
    }


}
