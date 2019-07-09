package com.sofka.sofkaemployee.domain;

import com.sofka.sofkaemployee.domain.model.Sofkiano;
import com.sofka.sofkaemployee.domain.service.impl.SofkianoServiceImpl;
import com.sofka.sofkaemployee.infraestructure.repository.SofkianoRepository;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class SofkianoServiceTest {
    Sofkiano sofkiano = new Sofkiano();

    @InjectMocks
    private SofkianoServiceImpl sofkianoService;

    @Mock
    private SofkianoRepository sofkianoRepository;

    @Before
    public void setUp(){
        sofkianoService = new SofkianoServiceImpl(sofkianoRepository);
    }

    @Test
    public void testGetAll(){
        List<Sofkiano> sofkianos = new ArrayList<>();
//        Mockito.when(sofkianoRepository.findAll()).thenReturn(sofkianos);
        Assertions.assertThat(sofkianoService.getAll()).isEqualTo(sofkianos);
    }

    @Test
    public void testFindById(){
        Mockito.when(sofkianoRepository.findByid(sofkiano.getId())).thenReturn(sofkiano);
        Assert.assertEquals("Nuevo mensaje", sofkiano, sofkianoService.getOne(sofkiano.getId()));
    }

    @Test
    public void testCreate(){
        Mockito.when(sofkianoRepository.save(sofkiano)).thenReturn(sofkiano);
        Assertions.assertThat(sofkianoService.create(sofkiano)).isEqualTo(sofkiano);
    }

    @Test
    public void testDelete(){
        Date date = new Date();
        Sofkiano sofkiano = new Sofkiano ("id", "nombre", "lastname", "a",1.0,
                2.0,3.0,"a","a",4.0,5.0,6.0,
                7.0,8.0,9.0,10.0,"a",11.0, date);
        Mockito.when(sofkianoRepository.existsById(sofkiano.getId())).thenReturn(true);
        Assert.assertEquals("Nuevo mensaje",true, sofkianoService.delete(sofkiano.getId()));
        Assert.assertEquals("Nuevo mensaje",false, sofkianoService.delete(null));
        Assert.assertEquals("Nuevo mensaje",false, sofkianoService.delete("diferenteId"));
    }

    @Test
    public void testUpdate(){
        Date date = new Date();
        Sofkiano sofkiano = new Sofkiano("id", "nombre", "lastname", "qwerqr",1.0,
                2.0,3.0,"a","a",4.0,5.0,6.0,
                7.0,8.0,9.0,10.0,"a",11.0, date);
        Sofkiano sofkiano1 = new Sofkiano("id", "nombre1", "lastname1", "a",1.0,
                2.0,3.0,"a","a",4.0,5.0,6.0,
                7.0,8.0,9.0,10.0,"a",11.0, date);
        Mockito.when(sofkianoRepository.existsById(sofkiano.getId())).thenReturn(true);
        Assert.assertEquals("Nuevo mensaje", sofkiano, sofkianoService.update(sofkiano.getId(), sofkiano));
        Assert.assertNotEquals("Nuevo mensaje", sofkiano1, sofkianoService.update("id", sofkiano));
    }
}
