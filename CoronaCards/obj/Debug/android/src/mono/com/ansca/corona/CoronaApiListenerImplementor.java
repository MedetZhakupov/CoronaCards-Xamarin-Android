package mono.com.ansca.corona;


public class CoronaApiListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.CoronaApiListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_addKeepScreenOnFlag:()V:GetAddKeepScreenOnFlagHandler:Com.Ansca.Corona.ICoronaApiListenerInvoker, Corona\n" +
			"n_onScreenLockStateChanged:(Z)V:GetOnScreenLockStateChanged_ZHandler:Com.Ansca.Corona.ICoronaApiListenerInvoker, Corona\n" +
			"n_removeKeepScreenOnFlag:()V:GetRemoveKeepScreenOnFlagHandler:Com.Ansca.Corona.ICoronaApiListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.ICoronaApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CoronaApiListenerImplementor.class, __md_methods);
	}


	public CoronaApiListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CoronaApiListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.ICoronaApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void addKeepScreenOnFlag ()
	{
		n_addKeepScreenOnFlag ();
	}

	private native void n_addKeepScreenOnFlag ();


	public void onScreenLockStateChanged (boolean p0)
	{
		n_onScreenLockStateChanged (p0);
	}

	private native void n_onScreenLockStateChanged (boolean p0);


	public void removeKeepScreenOnFlag ()
	{
		n_removeKeepScreenOnFlag ();
	}

	private native void n_removeKeepScreenOnFlag ();

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
