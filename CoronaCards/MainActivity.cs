using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Com.Ansca.Corona;

namespace CoronaCards
{
	[Activity (Label = "CoronaCards", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : Activity
	{
		CoronaView mCoronaView;

		protected override void OnCreate (Bundle bundle)
		{
			try {
				base.OnCreate (bundle);
				// Set our view from the "main" layout resource
				SetContentView (Resource.Layout.Main);
				mCoronaView = FindViewById<CoronaView> (Resource.Id.corona_view);
//				mCoronaView.Init ("Physics/");
				mCoronaView.Init ("JungleScene2/");
			} catch (Exception ex) {
				Console.WriteLine (ex.ToString ());
			}
		}

		protected override void OnPause ()
		{
			base.OnPause ();
			if (mCoronaView != null)
				mCoronaView.Pause ();
		}

		protected override void OnResume ()
		{
			base.OnResume ();
			if (mCoronaView != null)
				mCoronaView.Resume ();
		}

		protected override void OnDestroy ()
		{
			base.OnDestroy ();
			if (mCoronaView != null)
				mCoronaView.Destroy ();
		}
	}
}


