/**
 * Copyright (c) 2018. [Zexin Zhong]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions an limitations under the License.
 */


package com.sep.UniTrips.presenter;

import android.content.Context;
import android.view.View;

import com.sep.UniTrips.model.ImportCalendar.ImportCalendarInterface;
import com.sep.UniTrips.model.ImportCalendar.ImportCalendarTaskManager;
import com.sep.UniTrips.view.ImportCalendarActivity;

public class ImportCalendarPresneter implements ImportCalendarInterface.Presenter {

    private String mToken = null;
    private ImportCalendarTaskManager mImportCalendarTaskManager;
    private String mStudentId;
    private String mPassword;
    private Context mContext;
    private ImportCalendarActivity mImportCalendarView;
    private View mFocusView;
    private Boolean mCancel = false;

    public ImportCalendarPresneter(Context context,ImportCalendarActivity importCalendarView) {
        this.mContext = context;
        this.mImportCalendarView = importCalendarView;
//        this.mImportCalendarTaskManager = new ImportCalendarTaskManager();
    }

    @Override
    public void login(String year, String id, String password) {

    }

    @Override
    public Boolean isStudentId(String studentId) {
        return null;
    }

    @Override
    public Boolean isPasswordValid(String password) {
        return null;
    }

    @Override
    public void checkId_password() {

    }

    @Override
    public void showSnackBar(String errorMessage) {

    }

    @Override
    public void showToast(String errorMessage) {

    }

    @Override
    public void finishActivity() {

    }
}
