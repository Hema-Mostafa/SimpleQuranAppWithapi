package route.com.g2holyquran.Base;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.afollestad.materialdialogs.MaterialDialog;


public class MyBaseFragment extends Fragment {

    protected MyBaseActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MyBaseActivity) context;


    }

    public MaterialDialog ShowMessage(String title, String Message){
        return  activity.ShowMessage(title,Message);
    }

    public MaterialDialog ShowProgressBar(){
     return activity.ShowProgressBar();
    }

    public void HideProgressBar(){

     activity.HideProgressBar();
    }


}
