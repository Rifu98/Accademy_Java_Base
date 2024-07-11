package hotel;

import exceptions.HotelException;

public interface PrenotazioneHotel {
    void prenotaCamera(String nomeOspite) throws HotelException;
    void cancellaCamera(String nomeOspite) throws HotelException;
}
