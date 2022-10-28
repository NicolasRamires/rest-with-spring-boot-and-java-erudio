package br.com.erudio.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.ConverterNumber;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {
	private SimpleMath math = new SimpleMath(); 
    
    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumber.isNumeric(numberOne)|| !ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric!");
        }
        return math.sum(ConverterNumber.covertToDouble(numberOne), ConverterNumber.covertToDouble(numberTwo)); 
    }   
    
    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double subtraction
                     (@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumber.isNumeric(numberOne) || !ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric!");
        }
        return math.subtraction(ConverterNumber.covertToDouble(numberOne), ConverterNumber.covertToDouble(numberTwo)); 
    } 
    
    @RequestMapping(value="/multplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double multplication
                     (@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumber.isNumeric(numberOne) || !ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric!");
        }
        return math.multplication(ConverterNumber.covertToDouble(numberOne), ConverterNumber.covertToDouble(numberTwo)); 
    }
    
    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double division
                     (@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumber.isNumeric(numberOne) || !ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric!");
        }
        return math.division(ConverterNumber.covertToDouble(numberOne), ConverterNumber.covertToDouble(numberTwo)); 
    }
    
    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mean
                     (@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumber.isNumeric(numberOne) || !ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric!");
        }
        return math.mean(ConverterNumber.covertToDouble(numberOne), ConverterNumber.covertToDouble(numberTwo)); 
    }
    
    @RequestMapping(value="/squareRoot/{number}", method=RequestMethod.GET)
    public Double squareRoot
                     (@PathVariable("number") String number ) throws Exception {
        if (!ConverterNumber.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric!");
        }
        return math.squareRoot(ConverterNumber.covertToDouble(number)); 
    }
}