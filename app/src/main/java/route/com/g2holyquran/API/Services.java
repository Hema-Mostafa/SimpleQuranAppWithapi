package route.com.g2holyquran.API;

import retrofit2.Call;
import retrofit2.http.GET;
import route.com.g2holyquran.API.Model.RadiosResponse;


public interface Services {

    @GET("radio/radio_ar.json")
   Call<RadiosResponse> getRadioChannels();
}
