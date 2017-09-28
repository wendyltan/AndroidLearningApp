package xyz.wendyltanpcy.servicebestpractice;

/**
 * Created by Wendy on 2017/9/21.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCanceled();
}
