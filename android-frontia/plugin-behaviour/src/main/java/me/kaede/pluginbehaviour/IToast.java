package me.kaede.pluginbehaviour;

import android.content.Context;
import me.kaede.frontia.bridge.plugin.BaseBehaviour;

/**
 * Copyright (c) 2016 BiliBili Inc.
 * Created by kaede on 2016/4/8.
 */
public interface IToast extends BaseBehaviour {
	public void toast(Context context,String msg);
}
