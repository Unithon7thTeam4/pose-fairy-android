package unithon4.com.posefairy.api;

import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by jeongahri on 2018. 7. 28..
 */

public interface ApiService {

    @GET("/test")
    Response<Void> test();
}
