package com.czl.module_user.viewmodel

import com.czl.lib_base.base.BaseViewModel
import com.czl.lib_base.base.MyApplication
import com.czl.lib_base.bus.event.SingleLiveEvent
import com.czl.lib_base.data.DataRepository
import com.czl.lib_base.data.db.WebHistoryEntity
import com.czl.lib_base.util.RxThreadHelper

/**
 * @author Alwyn
 * @Date 2020/12/7
 * @Description
 */
class UserSettingVm(application: MyApplication, model: DataRepository) :
    BaseViewModel<DataRepository>(application, model) {

}