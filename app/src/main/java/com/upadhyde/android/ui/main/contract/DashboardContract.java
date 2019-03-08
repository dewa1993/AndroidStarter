package com.upadhyde.android.ui.main.contract;

import android.arch.lifecycle.LiveData;

import com.upadhyde.android.base.BaseContract;
import com.upadhyde.android.db.Input;
import com.upadhyde.android.repository.helper.ResourcesResponse;

import java.util.List;

public interface DashboardContract extends BaseContract {

    LiveData<ResourcesResponse<List<Input>>> getInputList(String inputFile);

}
