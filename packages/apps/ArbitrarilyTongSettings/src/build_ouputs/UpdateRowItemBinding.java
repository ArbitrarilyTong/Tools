// Generated by view binder compiler. Do not edit!
package win.arbitrarilytong.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import win.arbitrarilytong.settings.R;

public final class UpdateRowItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView updateDate;

  @NonNull
  public final TextView updateDesc;

  @NonNull
  public final ImageButton updateDownload;

  @NonNull
  public final TextView updateExtra;

  @NonNull
  public final ImageButton updateInfo;

  @NonNull
  public final TextView updateSize;

  @NonNull
  public final TextView updateTitle;

  @NonNull
  public final TextView updateVersion;

  private UpdateRowItemBinding(@NonNull CardView rootView, @NonNull ImageView imageView,
      @NonNull LinearLayout linearLayout, @NonNull TextView updateDate,
      @NonNull TextView updateDesc, @NonNull ImageButton updateDownload,
      @NonNull TextView updateExtra, @NonNull ImageButton updateInfo, @NonNull TextView updateSize,
      @NonNull TextView updateTitle, @NonNull TextView updateVersion) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
    this.updateDate = updateDate;
    this.updateDesc = updateDesc;
    this.updateDownload = updateDownload;
    this.updateExtra = updateExtra;
    this.updateInfo = updateInfo;
    this.updateSize = updateSize;
    this.updateTitle = updateTitle;
    this.updateVersion = updateVersion;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static UpdateRowItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UpdateRowItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.update_row_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UpdateRowItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.updateDate;
      TextView updateDate = ViewBindings.findChildViewById(rootView, id);
      if (updateDate == null) {
        break missingId;
      }

      id = R.id.updateDesc;
      TextView updateDesc = ViewBindings.findChildViewById(rootView, id);
      if (updateDesc == null) {
        break missingId;
      }

      id = R.id.update_download;
      ImageButton updateDownload = ViewBindings.findChildViewById(rootView, id);
      if (updateDownload == null) {
        break missingId;
      }

      id = R.id.updateExtra;
      TextView updateExtra = ViewBindings.findChildViewById(rootView, id);
      if (updateExtra == null) {
        break missingId;
      }

      id = R.id.update_info;
      ImageButton updateInfo = ViewBindings.findChildViewById(rootView, id);
      if (updateInfo == null) {
        break missingId;
      }

      id = R.id.updateSize;
      TextView updateSize = ViewBindings.findChildViewById(rootView, id);
      if (updateSize == null) {
        break missingId;
      }

      id = R.id.updateTitle;
      TextView updateTitle = ViewBindings.findChildViewById(rootView, id);
      if (updateTitle == null) {
        break missingId;
      }

      id = R.id.updateVersion;
      TextView updateVersion = ViewBindings.findChildViewById(rootView, id);
      if (updateVersion == null) {
        break missingId;
      }

      return new UpdateRowItemBinding((CardView) rootView, imageView, linearLayout, updateDate,
          updateDesc, updateDownload, updateExtra, updateInfo, updateSize, updateTitle,
          updateVersion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
