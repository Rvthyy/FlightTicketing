package com.smk.view;

import com.smk.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Create Booking")
@Route(value = "Create-Booking",
layout = MainView.class)
public class CreateBooking extends VerticalLayout {
    public CreateBooking() {
        createform();
    }

    private void createform() {
        setAlignItems(Alignment.STRETCH);
        ComboBox fromComboBox =
                new ComboBox("Dari");
        ComboBox toComboBox =
                new ComboBox("Ke");
        DatePicker departureDatePicker =
                new DatePicker("Tanggal keberangkatan");
        DatePicker arrivalDataPicker =
                new DatePicker("Tanggal Kedatangan");
        Button searchButton =
                new Button("search");
        searchButton.addThemeVariants(
                ButtonVariant.LUMO_PRIMARY
        );

        add(fromComboBox,toComboBox,departureDatePicker,arrivalDataPicker,searchButton);
    }
}
