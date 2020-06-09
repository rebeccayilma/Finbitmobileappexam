package et.com.synctech.mobileappexam;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Request {
    @GET("api/v1/employees")
    Call<JsonResponse> getJSON();
}
