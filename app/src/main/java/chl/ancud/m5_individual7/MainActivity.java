package chl.ancud.m5_individual7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import chl.ancud.m5_individual7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IViewPresenter {

    ActivityMainBinding binding;
    private Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presentador = new Presentador(this);
        binding.etxClave.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.evaluaClave(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void mostrarDebil() {
        Toast.makeText(this, "DEBIL", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarMedia() {
        Toast.makeText(this, "MEDIA", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarFuerte() {
        Toast.makeText(this, "FUERTE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarError() {

    }
}