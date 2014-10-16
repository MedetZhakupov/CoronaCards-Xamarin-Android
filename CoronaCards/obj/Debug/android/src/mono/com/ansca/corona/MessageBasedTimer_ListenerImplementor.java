package mono.com.ansca.corona;


public class MessageBasedTimer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.MessageBasedTimer.Listener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimerElapsed:()V:GetOnTimerElapsedHandler:Com.Ansca.Corona.MessageBasedTimer/IListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.MessageBasedTimer/IListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MessageBasedTimer_ListenerImplementor.class, __md_methods);
	}


	public MessageBasedTimer_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MessageBasedTimer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.MessageBasedTimer/IListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onTimerElapsed ()
	{
		n_onTimerElapsed ();
	}

	private native void n_onTimerElapsed ();

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
