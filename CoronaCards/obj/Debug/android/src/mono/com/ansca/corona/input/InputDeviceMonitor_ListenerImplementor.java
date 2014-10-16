package mono.com.ansca.corona.input;


public class InputDeviceMonitor_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.input.InputDeviceMonitor.Listener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onInputDeviceConnected:(I)V:GetOnInputDeviceConnected_IHandler:Com.Ansca.Corona.Input.InputDeviceMonitor/IListenerInvoker, Corona\n" +
			"n_onInputDeviceDisconnected:(I)V:GetOnInputDeviceDisconnected_IHandler:Com.Ansca.Corona.Input.InputDeviceMonitor/IListenerInvoker, Corona\n" +
			"n_onInputDeviceReconfigured:(I)V:GetOnInputDeviceReconfigured_IHandler:Com.Ansca.Corona.Input.InputDeviceMonitor/IListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Input.InputDeviceMonitor/IListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", InputDeviceMonitor_ListenerImplementor.class, __md_methods);
	}


	public InputDeviceMonitor_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == InputDeviceMonitor_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Input.InputDeviceMonitor/IListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onInputDeviceConnected (int p0)
	{
		n_onInputDeviceConnected (p0);
	}

	private native void n_onInputDeviceConnected (int p0);


	public void onInputDeviceDisconnected (int p0)
	{
		n_onInputDeviceDisconnected (p0);
	}

	private native void n_onInputDeviceDisconnected (int p0);


	public void onInputDeviceReconfigured (int p0)
	{
		n_onInputDeviceReconfigured (p0);
	}

	private native void n_onInputDeviceReconfigured (int p0);

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
