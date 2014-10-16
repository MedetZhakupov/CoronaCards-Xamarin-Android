package mono.com.ansca.corona.listeners;


public class CoronaSplashScreenApiListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.listeners.CoronaSplashScreenApiListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_hideSplashScreen:()V:GetHideSplashScreenHandler:Com.Ansca.Corona.Listeners.ICoronaSplashScreenApiListenerInvoker, Corona\n" +
			"n_showSplashScreen:()V:GetShowSplashScreenHandler:Com.Ansca.Corona.Listeners.ICoronaSplashScreenApiListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Listeners.ICoronaSplashScreenApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CoronaSplashScreenApiListenerImplementor.class, __md_methods);
	}


	public CoronaSplashScreenApiListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CoronaSplashScreenApiListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Listeners.ICoronaSplashScreenApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void hideSplashScreen ()
	{
		n_hideSplashScreen ();
	}

	private native void n_hideSplashScreen ();


	public void showSplashScreen ()
	{
		n_showSplashScreen ();
	}

	private native void n_showSplashScreen ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
