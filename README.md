📄 README
📌 Proje Adı: Haftalık Çalışma Programı (Enum Kullanımı)
📚 Açıklama:
Bu Java projesi, bir şirketin çalışanlarının haftalık çalışma saatlerini yönetebilmesi için enum kullanılarak hazırlanmıştır. Her gün için farklı çalışma saatleri tanımlanmıştır.

🔧 Özellikler:
Haftanın 7 günü için sabitler (SUNDAY – SATURDAY) Day enum sınıfında tanımlanmıştır.

Her günün çalışma saati bilgisi enum yapısında tutulur.

Kullanıcıdan bir gün alındığında, o günün çalışma saatleri ekrana yazdırılır.

Geçersiz girişler için uyarı mesajı gösterilir.

🛠️ Dosyalar:
Day.java: Haftanın günlerini ve her güne ait çalışma saatlerini tanımlar.

CalismaProgrami.java: Kullanıcıdan gün alır ve uygun mesajı gösterir.

▶️ Örnek Kullanım:
java
Kopyala
Düzenle
Lütfen bir gün girin (örn: MONDAY): friday  
FRIDAY günü çalışma saati: 09:00 - 17:00
💡 Not:
Gün adları İngilizce ve büyük harflerle yazılmalıdır (MONDAY, TUESDAY vb.). Küçük harfle yazılsa bile otomatik olarak büyük harfe çevrilir.
