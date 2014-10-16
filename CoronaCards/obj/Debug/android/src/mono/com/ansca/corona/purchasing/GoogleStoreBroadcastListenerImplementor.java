package mono.com.ansca.corona.purchasing;


public class GoogleStoreBroadcastListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.purchasing.GoogleStoreBroadcastListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler:Com.Ansca.Corona.Purchasing.IGoogleStoreBroadcastListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Purchasing.IGoogleStoreBroadcastListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleStoreBroadcastListenerImplementor.class, __md_methods);
	}


	public GoogleStoreBroadcastListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GoogleStoreBroadcastListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Purchasing.IGoogleStoreBroadcastListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

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
