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

package com.sep.UniTrips.model.ImportCalendar;

public interface ImportCalendarInterface {
    interface Presenter{
        void attemptGetCalendar(String id, String password, String year,String calendarName);
        void showToast(String message);
        void resetError();
        void setPasswordError(String errorMessage);
        void setIDError(String errorMessage);
        void focusView();
        void updateUI();
        void setCalendarNameError(String errorMessage);
    }

    interface View{
        void resetError();
        void setPasswordError(String errorMessage);
        void setIDError(String errorMessage);
        void focusView();
        void showToast(String message);
        void updateUI();
        void setCalendarNameError(String errorMessage);
    }
}
