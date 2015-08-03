# MaterialLibrary-v2.0


#How to use

 you can use the gradle dependency, you have to add these lines in your build.gradle file:

     repositories{
    jcenter()
    }

    dependencies {
    compile 'com.rba.ui:materialdesignlibrary:0.1.1'
    }

Some components have custom attributes, if you want use them, you must add this line in your xml file in the first component:

    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:materialdesign="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >
    </RelativeLayout>

If you are going to use a ScrollView, it is recommended that you use the CustomScrollView provided in this library to avoid problems with the custom components. To use this component:



    <com.rba.ui.ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >

    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:orientation="vertical">

        <com.rba.ui.MaterialEditText
            android:id="@+id/edit_text"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:hint="Library Name"
            android:text="MaterialEditText"
            android:textSize="34sp"
            app:met_autoscale="true"                     //For autoscale
            app:met_baseColor="@android:color/white"
            app:met_floatingLabel="highlight"
            app:met_maxCharacters="20"
            app:met_primaryColor="?colorAccent"
            app:met_singleLineEllipsis="true" />

        <com.rba.ui.Switch
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#1E88E5"
            app:check="true"></com.rba.ui.Switch>


        <com.rba.ui.CheckBox
            android:id="@+id/checkBox"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#1E88E5"
            app:check="true" />

        <com.rba.ui.ButtonFlat
            android:id="@+id/time_button"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="TimePicker" />

          <com.rba.ui.ButtonFloat
             android:id="@+id/buttonFloat"
             android:layout_width="wrap_content"
             android:layout_height="wrap_content"
             android:layout_alignParentRight="true"
             android:layout_alignParentBottom="true"
             android:layout_marginRight="24dp"
             android:background="#1E88E5"
             app:animate="true"
             app:iconDrawable="@drawable/ic_action_new" />

          <com.rba.ui.ButtonFloatSmall
              android:id="@+id/buttonFloatSmall"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:background="#1E88E5"
              materialdesign:iconDrawable="@drawable/ic_action_new"
          <com.rba.ui.ButtonRectangle
              android:id="@+id/button"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:background="#1E88E5"
              android:text="Button" />

        <com.rba.ui.ProgressBarCircularIndeterminate
            android:id="@+id/progressBarCircularIndeterminate"
            android:layout_width="32dp"
            android:layout_height="32dp"
            android:background="#1E88E5" />

        <com.rba.ui.Slider
            android:id="@+id/slider"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:background="#1E88E5"
            app:max="50"
            app:min="0" />

        <com.rba.ui.AutoScaleTextView
            android:layout_width="fill_parent"
            android:layout_height="50dp"

            android:singleLine="true"
            android:text="fdsafhsadfjlkjfsldsadfafdsfasdfasdafdafdadsfadfadsafdsadfasdsafdsaaddzfgdxghhjfhjfhfhfhfhjfhjffjfhjfjhfjyhfghdfhfhfhjfhjfhfhfhjfhjf"
            android:textSize="20dp" />

    </LinearLayout>
    </com.rba.ui.ScrollView>


## For Date and Time dialog :
### TimePicker :

         Calendar now = Calendar.getInstance();
                         TimePickerDialog tpd = TimePickerDialog.newInstance(
                                 MainActivity.this,
                                 now.get(Calendar.HOUR_OF_DAY),
                                 now.get(Calendar.MINUTE),
                                 mode24Hours.isChecked()
                         );
                         tpd.setThemeDark(modeDarkTime.isChecked());
                         tpd.vibrate(vibrateTime.isChecked());
                         tpd.setOnCancelListener(new DialogInterface.OnCancelListener() {
                             @Override
                             public void onCancel(DialogInterface dialogInterface) {
                                 Log.d("TimePicker", "Dialog was cancelled");
                             }
                         });
                         tpd.show(getFragmentManager(), "Timepickerdialog");


### DatePicker :


              Calendar now = Calendar.getInstance();
                            DatePickerDialog dpd = DatePickerDialog.newInstance(
                                    MainActivity.this,
                                    now.get(Calendar.YEAR),
                                    now.get(Calendar.MONTH),
                                    now.get(Calendar.DAY_OF_MONTH)
                            );
                            dpd.setThemeDark(modeDarkDate.isChecked());
                            dpd.vibrate(vibrateDate.isChecked());
                            dpd.show(getFragmentManager(), "Datepickerdialog");

## For Dialogs:

           private void showBasicNoTitle() {
                   new MaterialDialog.Builder(this)
                           .content(R.string.shareLocationPrompt)
                           .positiveText(R.string.agree)
                           .negativeText(R.string.disagree)
                           .show();
               }

               private void showBasic() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.useGoogleLocationServices)
                           .content(R.string.useGoogleLocationServicesPrompt)
                           .positiveText(R.string.agree)
                           .negativeText(R.string.disagree)
                           .show();
               }

               private void showBasicLongContent() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.useGoogleLocationServices)
                           .content(R.string.loremIpsum)
                           .positiveText(R.string.agree)
                           .negativeText(R.string.disagree)
                           .show();
               }

               private void showBasicIcon() {
                   new MaterialDialog.Builder(this)
                           .iconRes(R.drawable.ic_launcher)
                           .limitIconToDefaultSize() // limits the displayed icon size to 48dp
                           .title(R.string.useGoogleLocationServices)
                           .content(R.string.useGoogleLocationServicesPrompt)
                           .positiveText(R.string.agree)
                           .negativeText(R.string.disagree)
                           .show();
               }

               private void showStacked() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.useGoogleLocationServices)
                           .content(R.string.useGoogleLocationServicesPrompt)
                           .positiveText(R.string.speedBoost)
                           .negativeText(R.string.noThanks)
                           .btnStackedGravity(GravityEnum.END)
                           .forceStacking(true)  // this generally should not be forced, but is used for demo purposes
                           .show();
               }

               private void showNeutral() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.useGoogleLocationServices)
                           .content(R.string.useGoogleLocationServicesPrompt)
                           .positiveText(R.string.agree)
                           .negativeText(R.string.disagree)
                           .neutralText(R.string.more_info)
                           .show();
               }

               private void showCallbacks() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.useGoogleLocationServices)
                           .content(R.string.useGoogleLocationServicesPrompt)
                           .positiveText(R.string.agree)
                           .negativeText(R.string.disagree)
                           .neutralText(R.string.more_info)
                           .callback(new MaterialDialog.ButtonCallback() {
                               @Override
                               public void onPositive(MaterialDialog dialog) {
                                   showToast("Positive!");
                               }

                               @Override
                               public void onNeutral(MaterialDialog dialog) {
                                   showToast("Neutral");
                               }

                               @Override
                               public void onNegative(MaterialDialog dialog) {
                                   showToast("Negative…");
                               }
                           })
                           .show();
               }

               private void showList() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.socialNetworks)
                           .items(R.array.socialNetworks)
                           .itemsCallback(new MaterialDialog.ListCallback() {
                               @Override
                               public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                                   showToast(which + ": " + text);
                               }
                           })
                           .show();
               }

               private void showListNoTitle() {
                   new MaterialDialog.Builder(this)
                           .items(R.array.socialNetworks)
                           .itemsCallback(new MaterialDialog.ListCallback() {
                               @Override
                               public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                                   showToast(which + ": " + text);
                               }
                           })
                           .show();
               }

               private void showLongList() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.states)
                           .items(R.array.states)
                           .itemsCallback(new MaterialDialog.ListCallback() {
                               @Override
                               public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                                   showToast(which + ": " + text);
                               }
                           })
                           .positiveText(android.R.string.cancel)
                           .show();
               }

               private void showSingleChoice() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.socialNetworks)
                           .items(R.array.socialNetworks)
                           .itemsCallbackSingleChoice(2, new MaterialDialog.ListCallbackSingleChoice() {
                               @Override
                               public boolean onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                                   showToast(which + ": " + text);
                                   return true; // allow selection
                               }
                           })
                           .positiveText(R.string.choose)
                           .show();
               }

               private void showMultiChoice() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.socialNetworks)
                           .items(R.array.socialNetworks)
                           .itemsCallbackMultiChoice(new Integer[]{1, 3}, new MaterialDialog.ListCallbackMultiChoice() {
                               @Override
                               public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                                   StringBuilder str = new StringBuilder();
                                   for (int i = 0; i < which.length; i++) {
                                       if (i > 0) str.append('\n');
                                       str.append(which[i]);
                                       str.append(": ");
                                       str.append(text[i]);
                                   }
                                   showToast(str.toString());
                                   return true; // allow selection
                               }
                           })
                           .alwaysCallMultiChoiceCallback()
                           .positiveText(R.string.choose)
                           .show();
               }


               private void showMultiChoiceLimited() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.socialNetworks)
                           .items(R.array.socialNetworks)
                           .itemsCallbackMultiChoice(new Integer[]{1}, new MaterialDialog.ListCallbackMultiChoice() {
                               @Override
                               public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                                   boolean allowSelection = which.length <= 2; // limit selection to 2, the new selection is included in the which array
                                   if (!allowSelection) {
                                       showToast(R.string.selection_limit_reached);
                                   }
                                   return allowSelection;
                               }
                           })
                           .positiveText(R.string.dismiss)
                           .alwaysCallMultiChoiceCallback() // the callback will always be called, to check if selection is still allowed
                           .show();
               }

               private void showSimpleList() {
                   final MaterialSimpleListAdapter adapter = new MaterialSimpleListAdapter(this);
                   adapter.add(new MaterialSimpleListItem.Builder(this)
                           .content("username@gmail.com")
                           .icon(R.drawable.ic_circle_darker)
                           .build());
                   adapter.add(new MaterialSimpleListItem.Builder(this)
                           .content("user02@gmail.com")
                           .icon(R.drawable.ic_circle_darker)
                           .build());
                   adapter.add(new MaterialSimpleListItem.Builder(this)
                           .content(R.string.add_account)
                           .icon(R.drawable.ic_circle_lighter)
                           .build());

                   new MaterialDialog.Builder(this)
                           .title(R.string.set_backup)
                           .adapter(adapter, new MaterialDialog.ListCallback() {
                               @Override
                               public void onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                   MaterialSimpleListItem item = adapter.getItem(which);
                                   showToast(item.getContent().toString());
                               }
                           })
                           .show();
               }

               private void showCustomList() {
                   new MaterialDialog.Builder(this)
                           .title(R.string.socialNetworks)
                           .adapter(new ButtonItemAdapter(this, R.array.socialNetworks),
                                   new MaterialDialog.ListCallback() {
                                       @Override
                                       public void onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                           showToast("Clicked item " + which);
                                       }
                                   })
                           .show();
               }

