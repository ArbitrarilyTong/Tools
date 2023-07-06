// Generated by view binder compiler. Do not edit!
package win.arbitrarilytong.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import win.arbitrarilytong.settings.R;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final NestedScrollView aboutScrollView;

  @NonNull
  public final TextView ksuVersion;

  @NonNull
  public final TextView romVersion;

  @NonNull
  public final ImageButton updateSu;

  @NonNull
  public final ImageButton updateSystem;

  private FragmentAboutBinding(@NonNull NestedScrollView rootView,
      @NonNull NestedScrollView aboutScrollView, @NonNull TextView ksuVersion,
      @NonNull TextView romVersion, @NonNull ImageButton updateSu,
      @NonNull ImageButton updateSystem) {
    this.rootView = rootView;
    this.aboutScrollView = aboutScrollView;
    this.ksuVersion = ksuVersion;
    this.romVersion = romVersion;
    this.updateSu = updateSu;
    this.updateSystem = updateSystem;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      NestedScrollView aboutScrollView = (NestedScrollView) rootView;

      id = R.id.ksu_version;
      TextView ksuVersion = ViewBindings.findChildViewById(rootView, id);
      if (ksuVersion == null) {
        break missingId;
      }

      id = R.id.romVersion;
      TextView romVersion = ViewBindings.findChildViewById(rootView, id);
      if (romVersion == null) {
        break missingId;
      }

      id = R.id.update_su;
      ImageButton updateSu = ViewBindings.findChildViewById(rootView, id);
      if (updateSu == null) {
        break missingId;
      }

      id = R.id.update_system;
      ImageButton updateSystem = ViewBindings.findChildViewById(rootView, id);
      if (updateSystem == null) {
        break missingId;
      }

      return new FragmentAboutBinding((NestedScrollView) rootView, aboutScrollView, ksuVersion,
          romVersion, updateSu, updateSystem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
