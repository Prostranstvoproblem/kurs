#### курсовая
**МИНИСТЕРСТВО НАУКИ И ВЫСШЕГО ОБРАЗОВАНИЯ РОССИЙСКОЙ ФЕДЕРАЦИИ**

Федеральное государственное бюджетное образовательное учреждение высшего образования

«Воронежский государственный технический университет»

(ФГБОУ ВО «ВГТУ», ВГТУ)

Строительно-политехнический колледж

**КУРСОВОЙ ПРОЕКТ**

по дисциплине Разработка мобильных приложений

тема: Проектирование и разработка по индивидуальной предметной области

**Расчетно-пояснительная записка**

Разработала 06.11.2023 ИСП-201о, М. Р. Искакова

_(Подпись, дата) (группа, И.О., Фамилия)_

Руководитель М. Р. Пьяных

_(Подпись, дата) (И.О., Фамилия)_

Оценка

# Содержание

[Введение 3](#_Toc152546038)

[1.Анализ предметной области 4](#_Toc152546039)

[1.1Описание предметной области 4](#_Toc152546040)

[1.2Инструментальные средства разработки мобильных приложений 4](#_Toc152546041)

[1.3Цели и задачи курсового проекта 7](#_Toc152546042)

[2.Проектирование мобильного приложения 8](#_Toc152546043)

[2.1Обоснование выбора средства разработки 8](#_Toc152546044)

[2.2Проектирование приложения 9](#_Toc152546045)

[3.Разработка мобильного приложения 10](#_Toc152546046)

[3.1Структура мобильного приложения 10](#_Toc152546047)

[3.2Описание диалога с пользователем 12](#_Toc152546048)

[Заключение 14](#_Toc152546049)

[СПИСОК ЛИТЕРАТУРЫ 15](#_Toc152546050)

[ПРИЛОЖЕНИЕА 16](#_Toc152546051)

# Введение

В современном мире мобильные приложения стали неотъемлемой частью повседневной жизни, предоставляя пользователю бесчисленные возможности для удобства и развлечения. Однако среди многообразия приложений, иногда забывается о том, как они могут быть полезными и образовательными.

Для выполнения работы нам необходимо изучить ее предметную область. Под предметной областью принято понимать некоторую область человеческой деятельности или область реального мира, подлежащих изучению для организации управления и автоматизации, например, предприятие, вуз и т.д.

Азбука Морзе — способ знакового кодирования, в котором буквы алфавита, цифры, знаки препинания и другие символы представляются в виде последовательностей коротких и длинных сигналов, называемых точками и тире. Предназначена для передачи по последовательным каналам связи. Уникальной особенностью азбуки Морзе является возможность кодирования и декодирования человеком без применения специальных терминальных устройств.

Данное мобильное приложение будет предоставлять пользователю возможность использовать азбуку Морзе в повседневной жизни. Приложение позволяет вводить текст на обычном языке и преобразовывать его. Это может быть полезным для обучения и практики азбуки Морзе, отправки зашифрованных сообщений, или просто для создания уникального и креативного текста.

1. Анализ предметной области
  1. Описание предметной области

Переводчик с азбуки Морзе должен знать основные символы азбуки Морзе - коды, представленные чередованием длинных и коротких сигналов.

Входные и выходные данные: Переводчик должен быть способен принимать входные данные в формате азбуки Морзе, которые могут быть представлены с использованием разных форматов, например, с длинной и короткой длительностью сигналов, а также символов разделителей между символами и словами. Выходные данные должны быть в виде текста на естественном языке.

Алгоритмы декодирования и кодирования: Переводчик с азбуки Морзе должен осуществлять процесс декодирования азбуки Морзе в текст и кодирования текста в азбуку Морзе. Для этого может использоваться алгоритм, основанный на таблице соответствия между символами Морзе и символами алфавита.

Обработка ошибок и неправильных символов: Переводчик должен быть способен обнаруживать и обрабатывать ошибочные символы, возникшие в процессе передачи азбуки Морзе или при вводе неправильных символов.

  1. Инструментальные средства разработки мобильных приложений

Мобильные операционные системы играют важную роль в нашей жизни, упрощая общение, работу и развлечение. Они предлагают нам широкий выбор приложений и возможностей, которые делают нашу жизнь более удобной и интересной. Каждая операционная система имеет свои особенности, поэтому выбор зависит от предпочтений и потребностей каждого пользователя. Благодаря разнообразию операционных систем, мы можем выбрать устройство, которое наиболее полно удовлетворит наши запросы и требования.

Существует несколько популярных мобильных операционных систем: Android, iOS, Windows Phone и BlackBerry OS. Каждая из них имеет свою аудиторию и свои преимущества. Но мы будем рассматривать только Android и iOS.

Android — самая популярная операционная система для мобильных устройств. Разрабатывается компанией Google и используется на множестве смартфонов и планшетов. Основная особенность Android заключается в его открытости и возможности модификации.

Плюсы:

    - Открытая платформа: Android является открытой операционной системой, что позволяет разработчикам свободно создавать приложения и модифицировать систему.
    - Большой выбор устройств: Android работает на широком спектре устройств разных производителей, что дает пользователям больше возможностей выбора телефона или планшета.
    - Большой выбор приложений: Android имеет самое большое количество приложений в магазине Google Play, что обеспечивает широкий выбор функционала для пользователей.
- Настраиваемость: В Android пользователь имеет больше возможностей для настройки интерфейса и функционала устройства под свои предпочтения.

Минусы:

- Фрагментация: Так как Android работает на разных устройствах, производимых разными компаниями, это может вызывать некоторые проблемы с обновлениями ОС и совместимостью приложений.
- Безопасность: Поскольку Android является более открытой платформой, она может быть более подвержена вредоносным программам и хакерским атакам.
- Зависимость от производителей: Обновления Android-устройств зависят от производителей, и это может привести к длительным задержкам в распространении новых версий ОС.
- Оптимизация аппаратного и программного обеспечения: В Android иногда возникают проблемы с оптимизацией аппаратного и программного обеспечения, что может привести к низкой производительности устройства или неполадкам.

iOS — операционная система, разработанная компанией Apple для своих устройств, таких как iPhone и iPad. Она отличается своей простотой, интуитивным интерфейсом и высокой безопасностью. Все приложения для iOS должны быть одобрены компанией Apple перед появлением в App Store.

Плюсы:

- Защищенность: iOS обеспечивает высокий уровень безопасности и защиты данных, что делает ее предпочтительной для пользователей, ценящих конфиденциальность и безопасность.
- Оптимизация: Так как iOS разрабатывается только для устройств Apple, она обладает хорошей оптимизацией аппаратного и программного обеспечения, что обеспечивает высокую производительность и стабильность системы.
- Ёмкость и трансфер данных: ОС iOS предлагает высокую производительность в обработке данных и обеспечивает отличное качество звука и видео.
- Экосистема Apple: iOS интегрируется с другими продуктами Apple, что позволяет пользователям получать полный функционал, работая вместе с другими устройствами Apple, такими как MacBook, iPad и Apple Watch.

Минусы:

- Закрытая платформа: iOS является закрытой системой, что ограничивает возможности разработчиков в создании приложений и настройке интерфейса под индивидуальные нужды.
- Цена: Устройства Apple, работающие под управлением iOS, обычно имеют более высокую стоимость по сравнению с устройствами Android.
- Зависимость от Apple: Компания Apple контролирует полностью процесс обновлений и разработки системы, что может привести к ограничению свободы выбора для пользователя.
- Меньший выбор приложений: Магазин приложений App Store имеет меньшее количество приложений по сравнению с Google Play, что может быть ограничителем для пользователей, кто ищет определенные приложения или функционал.

Учитывая все плюсы и минусы двух операционных систем, мы пришли к выводу, что нам больше подходит ОС Android. Так как она является независимой от аппаратной начинки мобильного устройства, многозадачная и легко устанавливает приложения с разных ресурсов.

  1. Цели и задачи курсового проекта

Цель проекта: разработать мобильное приложение, которое предоставит пользователям возможность учить и практиковать азбуку Морзе.

Задачи проекта:

- Разработка интерфейса пользователя
- Реализация конвертера текста
- Тестирование и отладка
- Обновление и поддержка

Актуальность данного проекта состоит в том, что он содержит в себе использование современных технологий и предоставляет образовательный ресурс для тех, кто интересуется историей связи и желает изучить азбуку Морзе. Знание данной азбуки может быть полезным в экстремальных ситуациях, когда обычные средства связи недоступны. Пользователи могут научиться передавать срочные сообщения на языке Морзе, что может спасти жизни. Также, проект может предложить пользователю новый, оригинальный и увлекательный опыт в мире мобильных приложений, что особенно важно в эпоху насыщенной информацией и разнообразия развлекательных приложений.

1. Проектирование мобильного приложения
  1. Обоснование выбора средства разработки

Java — это многоплатформенный объектно-ориентированный язык программирования, работающий на миллиардах устройств по всему миру. На нем работают приложения, операционные системы для смартфонов, корпоративное программное обеспечение и многие известные программы. Несмотря на то, что Java был изобретен более 20 лет назад, в настоящее время он является самым популярным языком программирования среди разработчиков приложений.

Мы выбрали Java, так как он имеет много преимуществ. Например:

- мультифункциональность;
- достаточно простой синтаксис;
- независимость (код сможет работать на любой платформе, поддерживающей Java);
- надежность (благодаря строгой статической типизации);
- возможность параллельной разработки;
- хорошую организацию кода и его легкую поддержку;
- универсальность использования различных классов.

В качестве среды разработки для написания программы был выбран Android Studio. Это интегрированная среда разработки (IDE), которая включает в себя редактор кода, отладчик и тестовую среду.

Android Studio — официальная интегрированная среда разработки (IDE) для разработки приложений Android. Она подходит для взаимодействия на языках Java и Kotlin. С её помощью разработчики создают приложения для мобильных, планшетов, телевизоров, часов и других устройств.

IDE содержит инструменты для разработки, отладки, тестирования и отслеживания производительности приложений. Android Studio — бесплатная, работает на Windows, Mac и Linux.

  1. Проектирование приложения

Для понимания функционала приложения мы создадим диаграмму вариантов использования, которая описывает взаимоотношения и зависимости между группами вариантов использования и действующих лиц, участвующими в процессе.

При построении данной диаграммы учитывается, что действующий лицом является пользователь приложения, который имеет следующие возможные действия:

- Перевести из текста в азбуку Морзе
- Перевод из азбуки Морзе в текст
- Просмотр результата

Построенная диаграмма продемонстрирована на рисунке 1.

![](RackMultipart20231206-1-gm6kvc_html_a614cf1d96d350e0.png)

Рисунок 1 – Диаграмма прецендентов

1. Разработка мобильного приложения
  1. Структура мобильного приложения

Для наглядного представления работы мобильного приложения, была построена модульная структура функционирования приложения (рисунок 2), который состоит из следующих модулей:

- модуль графического взаимодействия с пользователем: макеты страниц (в данном случае XML), классы Activity для обработки представлений;
- адаптеры: связующий между набором данных и объектами, которые используют эти данные;
- сущности данных: представления данных в виде сущностей.

![](RackMultipart20231206-1-gm6kvc_html_dc89ae0d6356709a.png)

Рисунок 2 – Модульная структура приложения

Для понимания последовательности работы мобильного приложения, необходимо отобразить выполнение функционала и условия их выполнения в схеме алгоритма приложения (рисунок 3).

![](RackMultipart20231206-1-gm6kvc_html_23ce459c8cb55efd.png)

Рисунок 3 – Алгоритма работы приложения

Макеты в приложении основы на EmplyActivity. Графический интерфейс реализовывается с помощью XML-формата (рисунок 4).

![](RackMultipart20231206-1-gm6kvc_html_ac7e0144dc2dad1f.png)

Рисунок 4 – XML-формат реализации графического интерфейса

Для сборки проекта используется Gradle версии 8.1.13.

Для запуска проекта используется автономное мобильное устройство (SamsungGalaxyA51), подключаемое к проекту по средствам USB.

  1. Описание диалога с пользователем

После запуска приложения пользователя приветствует стартовое окно (рисунок 5).

![](RackMultipart20231206-1-gm6kvc_html_4c49684dbb640dbe.jpg)

Рисунок 5 – Стартовое окно программы

Здесь пользователь вводит текст для перевода. Он может быть как на русском языке, так и на Азбуке Морзе. Программа предусматривает оба варианта, а также содержит цифры и знаки препинания (рисунки 6-7).

![](RackMultipart20231206-1-gm6kvc_html_aef2c1ca55086ce7.jpg)

Рисунок 6 – Перевод текста с русского на Азбуку Морзе

![](RackMultipart20231206-1-gm6kvc_html_5752e35037e0dc7f.jpg)

Рисунок 7 – Перевод текста с Азбуки Морзе на русский

Заключение

В результате выполнения данной курсовой работы было разработано приложение "Переводчик Азбуки Морзе" на языке программирования Java с использованием Android Studio. Программа имеет простой интерфейс, легкий в использовании и объединяет в себе простоту, доступность и большой набор различных возможностей. Она не требует от пользователя глубоких знаний работы с телефоном, что делает ее удобной для широкого круга пользователей.

При решении поставленных задач были выполнены следующие действия:

- Проанализирована предметная область;

- Выбран метод решения поставленной задачи;
- Описаны основные требования к системе;
- Разработаны соответствующие диаграммы и модели, необходимые для наглядности демонстрации всех процессов;
- Составлен алгоритм решения задачи;

В результате мы достигли цели курсовой работы. Нами было создано простое в эксплуатации и администрировании приложение "Переводчик Азбуки Морзе", которое предоставляет пользователям возможность учить и практиковать азбуку Морзе.

СПИСОК ЛИТЕРАТУРЫ

1. Методические рекомендации Министерства образования и науки РФ от 20 июля 2015 г. № 06-846 [Электронный ресурс] / https://www.garant.ru/ – информационно-правовой портал / https://www.garant.ru/products/ipo/prime/doc/71076382/ – рекомендации по организации учебного процесса [Дата обращения: 26.02.2021].

2. Озерникова Т. Г., Пензина О. Н. О применении профессиональных стандартов при проектировании образовательных программ в вузе // Baikal Research Journal. – 2018. – Т. 9. – №. 1.

3. Федотенков А. Д. Разработка модуля планирования нагрузки по кафедре: дис. – Южно-Уральский государственный университет. – 2016.

4. Moreno M. et al. Re-distributed manufacturing to achieve a Circular Economy: A case study utilizing IDEF0 modeling //Procedia CIRP. – 2017. – Т. 63. – С. 686-691.

5. "Android Application Development All-in-One For Dummies" автора Barry Burd от 14 ноября 2011 года.

6. "The Art of Morse Code" автора Byron W. Bass от 22 октября 2023

7. "Руководство к знакам и сигналам" автора Уильяма Персона [содержит информацию об азбуке Морзе и ее использовании в технике и связи.]

8. "Коды и шифры" автора Александра Флоринского от 12 июля 2014 года [содержит информацию о кодировании, шифровании и использовании азбуки Морзе]

ПРИЛОЖЕНИЕА

MorseCode

package com.example.kurs;

 import java.util.HashMap;

 import java.util.HashMap;

 public class MorseCode {
static String[] _RUSS_ = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я", ".", ",", "?", "!", "+", "-", "=", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
 static String[] _MORSE_ = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", ".-.", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "..-..", "..--", ".-.-", ".-.-.-", "--..-", "..--..", "-.-.-", ".-.-.", "-....-", "-...-", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

 public static HashMap\<String, String\> _RUSS\_TO\_MORSE_ = new HashMap\<\>();
 public static HashMap\<String, String\> _MORSE\_TO\_RUSS_ = new HashMap\<\>();

 static {
for (int i = 0; i \< _RUSS_.length && i \< _MORSE_.length; i++) {
_RUSS\_TO\_MORSE_.put(_RUSS_[i], _MORSE_[i]);
_MORSE\_TO\_RUSS_.put(_MORSE_[i], _RUSS_[i]);
}
 }

public static String morseToRuss(String morseCode) {
 StringBuilder builder = new StringBuilder();
String[] words = morseCode.trim().split("");

 for (String word : words) {
 String russ = _MORSE\_TO\_RUSS_.get(word); // используем word какключ
builder.append(russ != null ? russ : " "); // еслисловоненайдено, добавляемпробел
}
return builder.toString();
}

public static String russToMorse(String russCode) {
 russCode = russCode.toUpperCase();
StringBuilder builder = new StringBuilder();
String[] words = russCode.trim().split("");

 for (String word : words) {
for (int i = 0; i \< word.length(); i++) {
 String morse = _RUSS\_TO\_MORSE_.get(word.substring(i, i + 1)); // получаемсимволипреобразуемеговморзе
builder.append(morse != null ? morse : " "); // еслисимволненайден, добавляемпробел
}
 builder.append(" "); // добавляемпробелмеждусловами
}
return builder.toString();
}
 }

MainActivity

package com.example.kurs;

 import androidx.appcompat.app.AppCompatActivity;
 import androidx.core.app.NotificationCompat;

 import android.app.Notification;
 import android.app.NotificationChannel;
 import android.app.NotificationManager;
 import android.content.Intent;
 import android.os.Bundle;
 import android.provider.Settings;
 import android.view.View;
 import android.widget.Button;
 import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

private TextView text;
 private TextView result;
 private Button toMorseBtn;
 private Button toRussBtn;


@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout._activity\_main_);
text = (TextView) findViewById(R.id._text_);
result = (TextView) findViewById(R.id._result_);
toMorseBtn = (Button) findViewById(R.id._toMorseBtn_);
toRussBtn = (Button) findViewById(R.id._toRussBtn_);

NotificationChannel channel = null;
 if (android.os.Build.VERSION._SDK\_INT_ \>= android.os.Build.VERSION\_CODES._O_) {
 channel = new NotificationChannel("TEST\_CHANNEL", "TEST\_DESCRIPTION", NotificationManager._IMPORTANCE\_DEFAULT_);
NotificationManager notificationManager = getSystemService(NotificationManager.class);
notificationManager.createNotificationChannel(channel);

// Check if the app has permission to post notifications
if (notificationManager.getNotificationChannel("TEST\_CHANNEL") == null) {
// Request the user to allow the app to post notifications
Intent intent = new Intent(Settings._ACTION\_APP\_NOTIFICATION\_SETTINGS_);
intent.putExtra(Settings._EXTRA\_APP\_PACKAGE_, getPackageName());
startActivity(intent);
} else {
// The app has permission to post notifications
Notification notification = new NotificationCompat.Builder(this, "TEST\_CHANNEL")
 .setContentTitle("РадыВассновавидеть!")
 .setContentText("Внеситеновыеиинтересныезаписи")
 .setSmallIcon(R.mipmap._ic\_launcher_)
 .build();
notificationManager.notify(42, notification);
}
 } else {
// Handle the case for older versions of Android
}

toMorseBtn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
 String textConvert = text.getText().toString();
String convertedText = MorseCode._russToMorse_(textConvert);
result.setText(convertedText);
}
 });
toRussBtn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
 String textConvert = text.getText().toString();
String convertedText = MorseCode._morseToRuss_(textConvert);
result.setText(convertedText);
}
 });
}
 }

Activity\_main.xml

\<?xml version="1.0" encoding="utf-8"?\>
 \<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout\_width="match\_parent"
android:layout\_height="match\_parent"
android:background="@drawable/ku"
tools:context=".MainActivity"\>

 \<EditText
android:id="@+id/text"
android:layout\_width="311dp"
android:layout\_height="49dp"
android:layout\_centerHorizontal="true"
android:layout\_marginStart="53dp"
android:layout\_marginEnd="48dp"
android:minHeight="48dp"
android:text="Перевод"
android:textColor="@color/black"
app:layout\_constraintBottom\_toBottomOf="parent"
app:layout\_constraintEnd\_toEndOf="parent"
app:layout\_constraintStart\_toStartOf="parent"
app:layout\_constraintTop\_toTopOf="parent"
app:layout\_constraintVertical\_bias="0.316" /\>

 \<LinearLayout
android:id="@+id/ctrls"
android:layout\_width="398dp"
android:layout\_height="90dp"
android:layout\_below="@id/text"
android:layout\_centerHorizontal="true"
android:layout\_marginStart="13dp"
android:layout\_marginTop="81dp"
android:layout\_marginBottom="107dp"
android:orientation="horizontal"
app:layout\_constraintBottom\_toTopOf="@+id/result"
app:layout\_constraintEnd\_toEndOf="parent"
app:layout\_constraintHorizontal\_bias="1.0"
app:layout\_constraintStart\_toStartOf="parent"
app:layout\_constraintTop\_toBottomOf="@+id/text"
app:layout\_constraintVertical\_bias="0.0"\>

 \</LinearLayout\>

 \<TextView
android:id="@+id/result"
android:layout\_width="123dp"
android:layout\_height="0dp"
android:layout\_below="@id/text"
android:layout\_centerHorizontal="true"
android:layout\_marginStart="144dp"
android:layout\_marginTop="278dp"
android:layout\_marginEnd="144dp"
android:layout\_marginBottom="169dp"
android:textSize="18sp"
android:textColor="@color/black"
app:layout\_constraintBottom\_toBottomOf="parent"
app:layout\_constraintEnd\_toEndOf="parent"
app:layout\_constraintHorizontal\_bias="0.0"
app:layout\_constraintStart\_toStartOf="parent"
app:layout\_constraintTop\_toBottomOf="@+id/text"
app:layout\_constraintVertical\_bias="1.0" /\>

 \<Button
android:id="@+id/toRussBtn"
android:layout\_width="wrap\_content"
android:layout\_height="wrap\_content"
android:layout\_marginStart="65dp"
android:layout\_marginTop="92dp"
android:layout\_marginEnd="247dp"
android:layout\_marginBottom="326dp"
android:text="To Russ"
android:textColor="@color/white"
android:backgroundTint="@color/black"
app:layout\_constraintBottom\_toBottomOf="parent"
app:layout\_constraintEnd\_toEndOf="@+id/ctrls"
app:layout\_constraintStart\_toStartOf="parent"
app:layout\_constraintTop\_toBottomOf="@+id/text" /\>

 \<Button
android:id="@+id/toMorseBtn"
android:layout\_width="wrap\_content"
android:layout\_height="wrap\_content"
android:layout\_marginStart="72dp"
android:layout\_marginTop="97dp"
android:layout\_marginEnd="67dp"
android:layout\_marginBottom="326dp"
android:backgroundTint="@color/black"
android:text="To Morse"
android:textColor="@color/white"
app:layout\_constraintBottom\_toBottomOf="parent"
app:layout\_constraintEnd\_toEndOf="parent"
app:layout\_constraintStart\_toEndOf="@+id/toRussBtn"
app:layout\_constraintTop\_toBottomOf="@+id/text" /\>

 \</androidx.constraintlayout.widget.ConstraintLayout\>
