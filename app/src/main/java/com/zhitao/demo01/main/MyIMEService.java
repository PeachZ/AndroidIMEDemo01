package com.zhitao.demo01.main;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.inputmethod.EditorInfo;

import com.zhitao.demo01.R;

/**
 * <pre>
 * -------------------------------
 * Description:
 *
 * -------------------------------
 * Author:  TaoZhi
 * Date:    2018/2/28
 * E_mail:  taozhi@hanwang.com.cn
 * <pre/>
 */

public class MyIMEService extends InputMethodService {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting) {
        super.onStartInputView(info, restarting);
        setCandidatesViewShown(true);
    }

    @Override
    public View onCreateInputView() {
        View candidateView  = getLayoutInflater().inflate(R.layout.layout_input_view, null);
        return candidateView ;
    }

    @Override
    public View onCreateCandidatesView() {
        View inputView = getLayoutInflater().inflate(R.layout.layout_candidate_view, null);
        return inputView;
    }
}
