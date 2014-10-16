package mono.com.ansca.corona.listeners;


public class CoronaStoreApiListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.listeners.CoronaStoreApiListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_storeFinishTransaction:(Ljava/lang/String;)V:GetStoreFinishTransaction_Ljava_lang_String_Handler:Com.Ansca.Corona.Listeners.ICoronaStoreApiListenerInvoker, Corona\n" +
			"n_storeInit:(Ljava/lang/String;)V:GetStoreInit_Ljava_lang_String_Handler:Com.Ansca.Corona.Listeners.ICoronaStoreApiListenerInvoker, Corona\n" +
			"n_storePurchase:(Ljava/lang/String;)V:GetStorePurchase_Ljava_lang_String_Handler:Com.Ansca.Corona.Listeners.ICoronaStoreApiListenerInvoker, Corona\n" +
			"n_storeRestore:()V:GetStoreRestoreHandler:Com.Ansca.Corona.Listeners.ICoronaStoreApiListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Listeners.ICoronaStoreApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CoronaStoreApiListenerImplementor.class, __md_methods);
	}


	public CoronaStoreApiListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CoronaStoreApiListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Listeners.ICoronaStoreApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void storeFinishTransaction (java.lang.String p0)
	{
		n_storeFinishTransaction (p0);
	}

	private native void n_storeFinishTransaction (java.lang.String p0);


	public void storeInit (java.lang.String p0)
	{
		n_storeInit (p0);
	}

	private native void n_storeInit (java.lang.String p0);


	public void storePurchase (java.lang.String p0)
	{
		n_storePurchase (p0);
	}

	private native void n_storePurchase (java.lang.String p0);


	public void storeRestore ()
	{
		n_storeRestore ();
	}

	private native void n_storeRestore ();

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
