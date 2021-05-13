package com.example.diginotes;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.diginotes.databinding.ActivityMainBindingImpl;
import com.example.diginotes.databinding.DialogForgotPasswordBindingImpl;
import com.example.diginotes.databinding.FragmentCameraBindingImpl;
import com.example.diginotes.databinding.FragmentFirstHomePageBindingImpl;
import com.example.diginotes.databinding.FragmentFolderOptionsBindingImpl;
import com.example.diginotes.databinding.FragmentLoginPageBindingImpl;
import com.example.diginotes.databinding.FragmentMainHomePageBindingImpl;
import com.example.diginotes.databinding.FragmentSignUpBindingImpl;
import com.example.diginotes.databinding.FragmentSpeechToTextBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGFORGOTPASSWORD = 2;

  private static final int LAYOUT_FRAGMENTCAMERA = 3;

  private static final int LAYOUT_FRAGMENTFIRSTHOMEPAGE = 4;

  private static final int LAYOUT_FRAGMENTFOLDEROPTIONS = 5;

  private static final int LAYOUT_FRAGMENTLOGINPAGE = 6;

  private static final int LAYOUT_FRAGMENTMAINHOMEPAGE = 7;

  private static final int LAYOUT_FRAGMENTSIGNUP = 8;

  private static final int LAYOUT_FRAGMENTSPEECHTOTEXT = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.dialog_forgot_password, LAYOUT_DIALOGFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_camera, LAYOUT_FRAGMENTCAMERA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_first_home_page, LAYOUT_FRAGMENTFIRSTHOMEPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_folder_options, LAYOUT_FRAGMENTFOLDEROPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_login_page, LAYOUT_FRAGMENTLOGINPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_main_home_page, LAYOUT_FRAGMENTMAINHOMEPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_sign_up, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.diginotes.R.layout.fragment_speech_to_text, LAYOUT_FRAGMENTSPEECHTOTEXT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGFORGOTPASSWORD: {
          if ("layout/dialog_forgot_password_0".equals(tag)) {
            return new DialogForgotPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_forgot_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCAMERA: {
          if ("layout/fragment_camera_0".equals(tag)) {
            return new FragmentCameraBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_camera is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFIRSTHOMEPAGE: {
          if ("layout/fragment_first_home_page_0".equals(tag)) {
            return new FragmentFirstHomePageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_first_home_page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOLDEROPTIONS: {
          if ("layout/fragment_folder_options_0".equals(tag)) {
            return new FragmentFolderOptionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_folder_options is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGINPAGE: {
          if ("layout/fragment_login_page_0".equals(tag)) {
            return new FragmentLoginPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login_page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINHOMEPAGE: {
          if ("layout/fragment_main_home_page_0".equals(tag)) {
            return new FragmentMainHomePageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_home_page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_sign_up_0".equals(tag)) {
            return new FragmentSignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPEECHTOTEXT: {
          if ("layout/fragment_speech_to_text_0".equals(tag)) {
            return new FragmentSpeechToTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_speech_to_text is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.example.diginotes.R.layout.activity_main);
      sKeys.put("layout/dialog_forgot_password_0", com.example.diginotes.R.layout.dialog_forgot_password);
      sKeys.put("layout/fragment_camera_0", com.example.diginotes.R.layout.fragment_camera);
      sKeys.put("layout/fragment_first_home_page_0", com.example.diginotes.R.layout.fragment_first_home_page);
      sKeys.put("layout/fragment_folder_options_0", com.example.diginotes.R.layout.fragment_folder_options);
      sKeys.put("layout/fragment_login_page_0", com.example.diginotes.R.layout.fragment_login_page);
      sKeys.put("layout/fragment_main_home_page_0", com.example.diginotes.R.layout.fragment_main_home_page);
      sKeys.put("layout/fragment_sign_up_0", com.example.diginotes.R.layout.fragment_sign_up);
      sKeys.put("layout/fragment_speech_to_text_0", com.example.diginotes.R.layout.fragment_speech_to_text);
    }
  }
}
