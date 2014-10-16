package mono.com.ansca.corona.purchasing;


public class GoogleStoreConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.purchasing.GoogleStoreConnectionListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionClosed:()V:GetOnConnectionClosedHandler:Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerInvoker, Corona\n" +
			"n_onConnectionLost:()V:GetOnConnectionLostHandler:Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerInvoker, Corona\n" +
			"n_onConnectionOpened:()V:GetOnConnectionOpenedHandler:Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerInvoker, Corona\n" +
			"n_onReceivedNotification:(Lcom/ansca/corona/purchasing/GoogleStoreNotification;)V:GetOnReceivedNotification_Lcom_ansca_corona_purchasing_GoogleStoreNotification_Handler:Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerInvoker, Corona\n" +
			"n_onReceivedResponse:(JLcom/ansca/corona/purchasing/GoogleStoreResponseCode;)V:GetOnReceivedResponse_JLcom_ansca_corona_purchasing_GoogleStoreResponseCode_Handler:Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleStoreConnectionListenerImplementor.class, __md_methods);
	}


	public GoogleStoreConnectionListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GoogleStoreConnectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Purchasing.IGoogleStoreConnectionListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionClosed ()
	{
		n_onConnectionClosed ();
	}

	private native void n_onConnectionClosed ();


	public void onConnectionLost ()
	{
		n_onConnectionLost ();
	}

	private native void n_onConnectionLost ();


	public void onConnectionOpened ()
	{
		n_onConnectionOpened ();
	}

	private native void n_onConnectionOpened ();


	public void onReceivedNotification (com.ansca.corona.purchasing.GoogleStoreNotification p0)
	{
		n_onReceivedNotification (p0);
	}

	private native void n_onReceivedNotification (com.ansca.corona.purchasing.GoogleStoreNotification p0);


	public void onReceivedResponse (long p0, com.ansca.corona.purchasing.GoogleStoreResponseCode p1)
	{
		n_onReceivedResponse (p0, p1);
	}

	private native void n_onReceivedResponse (long p0, com.ansca.corona.purchasing.GoogleStoreResponseCode p1);

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
