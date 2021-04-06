// Generated by data binding compiler. Do not edit!
package com.example.diginotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.diginotes.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFirstHomePageBinding extends ViewDataBinding {
  @NonNull
  public final Button continueButton;

  @NonNull
  public final ImageView imageView;

  protected FragmentFirstHomePageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button continueButton, ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.continueButton = continueButton;
    this.imageView = imageView;
  }

  @NonNull
  public static FragmentFirstHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_first_home_page, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFirstHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFirstHomePageBinding>inflateInternal(inflater, R.layout.fragment_first_home_page, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFirstHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_first_home_page, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFirstHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFirstHomePageBinding>inflateInternal(inflater, R.layout.fragment_first_home_page, null, false, component);
  }

  public static FragmentFirstHomePageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentFirstHomePageBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFirstHomePageBinding)bind(component, view, R.layout.fragment_first_home_page);
  }
}
