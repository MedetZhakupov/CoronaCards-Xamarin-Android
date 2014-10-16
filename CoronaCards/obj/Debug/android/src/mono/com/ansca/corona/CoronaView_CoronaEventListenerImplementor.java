package mono.com.ansca.corona;


public class CoronaView_CoronaEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.CoronaView.CoronaEventListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceivedCoronaEvent:(Lcom/ansca/corona/CoronaView;Ljava/util/Hashtable;)Ljava/lang/Object;:GetOnReceivedCoronaEvent_Lcom_ansca_corona_CoronaView_Ljava_util_Hashtable_Handler:Com.Ansca.Corona.CoronaView/ICoronaEventListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.CoronaView/ICoronaEventListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CoronaView_CoronaEventListenerImplementor.class, __md_methods);
	}


	public CoronaView_CoronaEventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CoronaView_CoronaEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.CoronaView/ICoronaEventListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object onReceivedCoronaEvent (com.ansca.corona.CoronaView p0, java.util.Hashtable p1)
	{
		return n_onReceivedCoronaEvent (p0, p1);
	}

	private native java.lang.Object n_onReceivedCoronaEvent (com.ansca.corona.CoronaView p0, java.util.Hashtable p1);

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
