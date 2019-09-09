package wordseg.nirvasoft.com;
public class MainTester {
	public static void main(String[] args) {
		String s = new String(data());
		System.out.println(s); 
		System.out.println( UtilMM.debugUni(s)); 
		System.out.println( SyllableMM.sBreak(s));
		System.out.println( WordMM.sMerge(SyllableMM.sBreak(s)));
	}
	static String data() {
		return "မေ-မေ နေကောင်းလား  (၁၂၃/၄၅က-အ) atoz ကမ္ဘာကြီး နေကောင်းလားမသိဘူး၊ ဟာဟ  ABC EFG မတတ်ဘူး။";
		//return "ယူနီကုဒ်စံကိုအသုံးပြုခြင်းအားဖြင့် မြန်မာစာနှင့် တိုင်းရင်းသားစာများကို ကမ္ဘာတစ်ဝန်းရှိ ဘာသာစကားများနှင့် တွဲဖက်ကာ အပြန်အလှန်‌ ရေးသားအသုံးပြုနိုင်မည့် အပြင် ကွန်ပျူတာနှင့် မိုဘိုင်းဖုန်း အသုံးပြုရာတွင် အက္ခရာစဉ်ခြင်း၊ ရှာဖွေခြင်း နှင့် ဘာသာပြန်ခြင်း အစရှိသော ဘာသာစကားများနှင့် သက်ဆိုင်သည့် အခြေခံနှင့် အဆင့်မြင့် လုပ်ငန်းစဉ်များကို ဆော့ဝဲစနစ်မျိုးစုံတွင် လွယ်လင့်တကူ အသုံးပြုလာနိုင်ကြပါလိမ့်မည်။ Gboard, Google Translate, Google Maps, Google Lens, Microsoft Office, ICU, CLDR အစရှိသော နိုင်ငံတကာ ဆော့ဝဲစနစ်များနှင့် Windows, Mac, Linux, Android, iOS အစရှိသော Operating Systems များသည် ယူနီကုဒ်စံစနစ်ကိုသာ အခြေခံထားကြသည့်အတွက် ၎င်းဆော့ဝဲများကိုလည်း ပိုမိုတွင်ကျယ်စွာ အကျိုးရှိရှိ အသုံးပြုလာနိုင်ကြမည် ဖြစ်ပါသည်။";
	}
}