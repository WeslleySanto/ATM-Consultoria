package br.com.weslleyesanto.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.weslleyesanto.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Element versao = new Element();
        versao.setTitle("Versão 1.0.0");


        View paginaSobre = new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                //.setDescription()

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("http://www.atmconsultoria.com.br/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("weslley.santo.5", "Facabook")
                .addInstagram("weslleyesanto", "Instagram")
                .addTwitter("weslleyesanto", "Twitter")
                .addYoutube("weslleyesanto")
                .addGitHub("weslley.santo", "GitHub")
                .addPlayStore("com.facebook.katana")

                .addItem(versao)

                .create();

        return paginaSobre;
    }
}
