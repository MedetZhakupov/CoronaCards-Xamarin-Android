package mono.com.ansca.corona.input;


public class InputDeviceContext_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.input.InputDeviceContext.Listener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Input.InputDeviceContext/IListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", InputDeviceContext_ListenerImplementor.class, __md_methods);
	}


	public InputDeviceContext_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == InputDeviceContext_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Input.InputDeviceContext/IListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
