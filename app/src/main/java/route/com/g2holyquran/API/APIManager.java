package route.com.g2holyquran.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIManager {


    private static Retrofit retrofitInstance;

    private static Retrofit getInstance(){
        if(retrofitInstance==null){
            //build
             retrofitInstance = new Retrofit.Builder()
                    .baseUrl("http://mp3quran.net/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofitInstance;
    }

    public static  Services getAPIS(){

        return getInstance().create(Services.class);
    }

}
