import BookModel from "../../models/BookModel";
import {use, useEffect, useState} from "react";
import { SpinnerLoading } from "../Utils/SpinnerLoading";

export const BookCheckoutPage = () => {
  
    const [book, setBook] = useState<BookModel>()
    const [isLoading, setIsLoading] = useState(true);
    const [httpError,setHtttpError] = useState(null);

    const bookId = (window.location.pathname).split('/')[2];

    useEffect(() => {
      const fetchBook = async () => {
        const host: string = "localhost";
        const baseUrl: string = `http://${host}:8080/api/books/${bookId}`;


        const respose = await fetch(baseUrl);

        if (!respose.ok) {
          throw new Error(`Something went wrong!`);
        }

        const responseJson = await respose.json();


        const loadedBook: BookModel = {
            id: responseJson.id,
            title: responseJson.title,
            author: responseJson.author,
            description: responseJson.description,
            copies: responseJson.copies,
            copiesAvailable: responseJson.copiesAvailable,
            category: responseJson.category,
            img: responseJson.img,            
        };


        setBook(loadedBook);
        setIsLoading(false);
      };
      fetchBook().catch((error: any) => {
        setIsLoading(false);
        setHtttpError(error.message);
      });
    }, []);

    if (isLoading) {
      return (
        <div className='container m-5'>
          <SpinnerLoading></SpinnerLoading>
        </div>
      );
    }

    if (httpError) {
      return (
        <div className='container m-5'>
          <p>{httpError}</p>
        </div>
      );
    }    
  
    return (
    <>
      {/* Desktop View */}
      <div className="container d-none d-lg-block">
        <div className="row mt-5">
          <div className="col-sm-2 col-md-2">
            <img
              src={book?.img}
              width="226"
              height="349"
              alt="Book"
            />
          </div>
          <div className="col-4 col-md-4 container">
            <div className="ml-2">
              <h2>{book?.title}</h2>
              <h5 className="text-primary">{book?.author}</h5>
              <p className="lead">{book?.description}</p>
            </div>
          </div>
        </div>
        <hr />
      </div>
      {/* Mobile View */}
      <div className="container d-lg-none mt-5">
        <div className="d-flex justify-content-center align-items-center">
          <img
            src={book?.img}
            width="226"
            height="349"
            alt="Book"
          />
        </div>
        <div className="mt-4">
          <div className="ml-2">
              <h2>{book?.title}</h2>
              <h5 className="text-primary">{book?.author}</h5>
              <p className="lead">{book?.description}</p>
          </div>
        </div>
        <hr />
      </div>
    </>
  );
};