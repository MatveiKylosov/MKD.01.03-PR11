package com.example.banks;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenProfile(View view) {
        Toast toast = Toast.makeText(this, "Профиль", Toast.LENGTH_LONG);
        toast.show();
    }

    public void OpenStore(View view) {
        Toast toast = Toast.makeText(this, "Корзина", Toast.LENGTH_LONG);
        toast.show();
    }

    public void OpenMenu(View view) {
        Toast toast = Toast.makeText(this, "Меню", Toast.LENGTH_LONG);
        toast.show();
    }

    public void OpenWallet(View view) {
        Toast toast = Toast.makeText(this, "Кошелёк", Toast.LENGTH_LONG);
        toast.show();
    }

    public void OpenHidden(View view) {
        Toast toast = Toast.makeText(this, "Глаз", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenDots(View view) {
        Toast toast = Toast.makeText(this, "Три точки", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenQR(View view) {
        Toast toast = Toast.makeText(this, "QR", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenShield(View view) {
        Toast toast = Toast.makeText(this, "Щит", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenCard(View view) {
        Toast toast = Toast.makeText(this, "Карта", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenTrans(View view) {
        Toast toast = Toast.makeText(this, "Переводы", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenCreateTrans(View view) {
        Toast toast = Toast.makeText(this, "Создать перевод", Toast.LENGTH_LONG);
        toast.show();
    }
    public void CloseLeonid(View view) {
        Toast toast = Toast.makeText(this, "Закрыть леонида", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenLeonid(View view) {
        Toast toast = Toast.makeText(this, "Открыть леонида", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenExpenses(View view) {
        Toast toast = Toast.makeText(this, "Платежи", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAllExpenses(View view) {
        Toast toast = Toast.makeText(this, "Все платежи", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAuto(View view) {
        Toast toast = Toast.makeText(this, "Транспорт", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenCafe(View view) {
        Toast toast = Toast.makeText(this, "Кафе", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenCredits(View view) {
        Toast toast = Toast.makeText(this, "Кредиты", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAllServices(View view) {
        Toast toast = Toast.makeText(this, "Все сервисы", Toast.LENGTH_LONG);
        toast.show();
    }
    public void CreateCredits(View view) {
        Toast toast = Toast.makeText(this, "Создать кредит", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAllAdvert(View view) {
        Toast toast = Toast.makeText(this, "Все предложения", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenRecommend(View view) {
        Toast toast = Toast.makeText(this, "Рекомендации", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenJaba(View view) {
        Toast toast = Toast.makeText(this, "ЖАБА!", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenCourse(View view) {
        Toast toast = Toast.makeText(this, "Все курсы", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenCNY(View view) {
        Toast toast = Toast.makeText(this, "Китай", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAED(View view) {
        Toast toast = Toast.makeText(this, "Дирхам", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenUSD(View view) {
        Toast toast = Toast.makeText(this, "Доллары", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenMain(View view) {
        Toast toast = Toast.makeText(this, "Меню", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenSafe(View view) {
        Toast toast = Toast.makeText(this, "Накопления", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAssistent(View view) {
        Toast toast = Toast.makeText(this, "Ассистент", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenMenuTrans(View view) {
        Toast toast = Toast.makeText(this, "Платежи", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenHistory(View view) {
        Toast toast = Toast.makeText(this, "История", Toast.LENGTH_LONG);
        toast.show();
    }
    public void OpenAdvert(View view) {
        Toast toast = Toast.makeText(this, "Реклама", Toast.LENGTH_LONG);
        toast.show();
    }
    public void Close(View view) {
        Toast toast = Toast.makeText(this, "Закрыть рекламу", Toast.LENGTH_LONG);
        toast.show();
    }
}