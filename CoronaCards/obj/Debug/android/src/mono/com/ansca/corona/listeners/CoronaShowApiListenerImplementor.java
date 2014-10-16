package mono.com.ansca.corona.listeners;


public class CoronaShowApiListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ansca.corona.listeners.CoronaShowApiListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_showAppStoreWindow:(Ljava/util/HashMap;)Z:GetShowAppStoreWindow_Ljava_util_HashMap_Handler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"n_showCameraWindowForImage:(Ljava/lang/String;)V:GetShowCameraWindowForImage_Ljava_lang_String_Handler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"n_showCameraWindowForVideo:(II)V:GetShowCameraWindowForVideo_IIHandler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"n_showSelectImageWindowUsing:(Ljava/lang/String;)V:GetShowSelectImageWindowUsing_Ljava_lang_String_Handler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"n_showSelectVideoWindow:()V:GetShowSelectVideoWindowHandler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"n_showSendMailWindowUsing:(Lcom/ansca/corona/MailSettings;)V:GetShowSendMailWindowUsing_Lcom_ansca_corona_MailSettings_Handler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"n_showSendSmsWindowUsing:(Lcom/ansca/corona/SmsSettings;)V:GetShowSendSmsWindowUsing_Lcom_ansca_corona_SmsSettings_Handler:Com.Ansca.Corona.Listeners.ICoronaShowApiListenerInvoker, Corona\n" +
			"";
		mono.android.Runtime.register ("Com.Ansca.Corona.Listeners.ICoronaShowApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CoronaShowApiListenerImplementor.class, __md_methods);
	}


	public CoronaShowApiListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CoronaShowApiListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Ansca.Corona.Listeners.ICoronaShowApiListenerImplementor, Corona, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean showAppStoreWindow (java.util.HashMap p0)
	{
		return n_showAppStoreWindow (p0);
	}

	private native boolean n_showAppStoreWindow (java.util.HashMap p0);


	public void showCameraWindowForImage (java.lang.String p0)
	{
		n_showCameraWindowForImage (p0);
	}

	private native void n_showCameraWindowForImage (java.lang.String p0);


	public void showCameraWindowForVideo (int p0, int p1)
	{
		n_showCameraWindowForVideo (p0, p1);
	}

	private native void n_showCameraWindowForVideo (int p0, int p1);


	public void showSelectImageWindowUsing (java.lang.String p0)
	{
		n_showSelectImageWindowUsing (p0);
	}

	private native void n_showSelectImageWindowUsing (java.lang.String p0);


	public void showSelectVideoWindow ()
	{
		n_showSelectVideoWindow ();
	}

	private native void n_showSelectVideoWindow ();


	public void showSendMailWindowUsing (com.ansca.corona.MailSettings p0)
	{
		n_showSendMailWindowUsing (p0);
	}

	private native void n_showSendMailWindowUsing (com.ansca.corona.MailSettings p0);


	public void showSendSmsWindowUsing (com.ansca.corona.SmsSettings p0)
	{
		n_showSendSmsWindowUsing (p0);
	}

	private native void n_showSendSmsWindowUsing (com.ansca.corona.SmsSettings p0);

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
