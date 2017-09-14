package xyz.wendyltanpcy.androidthreadtest;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Wendy on 2017/9/14.
 */

public class DownloadTask extends AsyncTask<Void,Integer,Boolean> {

    private Context context;
    private ProgressDialog progressDialog;
    private int percent = 0;

    public DownloadTask(Context context){
        this.context = context;
        progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Download dialog");
    }
    @Override
    protected void onProgressUpdate(Integer... values) {
        progressDialog.setMessage("Downloaded "+ values[0] + "%");

    }

    @Override
    protected void onPreExecute() {
        progressDialog.show();
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        try{
            while(true){
                int downloadPercent = doDownload();
                publishProgress(downloadPercent);
                if (downloadPercent>=1000){
                    break;
                }
            }
        }catch (Exception e){
            return  false;
        }
        return true;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        progressDialog.dismiss();
        if (result){
            Toast.makeText(context,"Download Successed!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context,"Download Failed!",Toast.LENGTH_LONG).show();
        }
    }

    private int doDownload() {
        this.percent += 1;
        Toast.makeText(context,"doing something",Toast.LENGTH_SHORT).show();
        return this.percent;
    }
}
