package com.example.demo.mappers;

import com.example.demo.dtos.*;
import com.example.demo.entities.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AssuranceImpl {

    public ClientDTO fromClient(Client client){
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(client,clientDTO);
        return clientDTO;
    }
    public Client fromClintDTO(ClientDTO clientDTO){
        Client client = new Client();
        BeanUtils.copyProperties(clientDTO,client);
        return client;
    }
    public PaiementDTO fromPaiement(Paiement paiement){
        PaiementDTO paiementDTO =new PaiementDTO();
        BeanUtils.copyProperties(paiement,paiementDTO);
        return paiementDTO;

    }
    public ContratAutomobileDTO fromContratAutomobile(ContratAutomobile contratAutomobile){
        ContratAutomobileDTO contratAutomobileDTO = new ContratAutomobileDTO();
        BeanUtils.copyProperties(contratAutomobile,contratAutomobileDTO);
        return contratAutomobileDTO;

    }
    public ContratAutomobile fromContratAutomobileDTO(ContratAutomobileDTO contratAutomobileDTO){
        ContratAutomobile contratAutomobile=new ContratAutomobile();
        BeanUtils.copyProperties(contratAutomobileDTO,contratAutomobile);
        return contratAutomobile;
    }
    public ContratHabitationDTO fromContratHabitation(ContratHabitation contratHabitation){
        ContratHabitationDTO contratHabitationDTO = new ContratHabitationDTO();
        BeanUtils.copyProperties(contratHabitation,contratHabitationDTO);
        return contratHabitationDTO;

    }
    public ContratHabitation fromContratHabitationDTO(ContratHabitationDTO contratHabitationDTO){
        ContratHabitation contratHabitation=new ContratHabitation();
        BeanUtils.copyProperties(contratHabitationDTO,contratHabitation);
        return contratHabitation;
    }
    public ContratSante fromContratSanteDTO(ContratSanteDTO contratSanteDTO){
        ContratSante contratSante = new ContratSante();
        BeanUtils.copyProperties(contratSanteDTO, contratSante);
        return contratSante;
    }
    public ContratSanteDTO fromContratSante(ContratSante contratSante){
        ContratSanteDTO contratSanteDTO = new ContratSanteDTO();
        BeanUtils.copyProperties(contratSante, contratSanteDTO);
        return contratSanteDTO;
    }

}
