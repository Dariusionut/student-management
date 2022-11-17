import * as React from 'react';
import { Col, Row, Spinner } from 'reactstrap';
import { RefObject, useRef, useState } from 'react';

export interface IInstitutionsPageProps {}

const InstitutionsPage: React.FunctionComponent<IInstitutionsPageProps> = (props: IInstitutionsPageProps) => {
    const URL =
        'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d91160.56672516275!2d26.024597958788608!3d44.43792692055031!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40b1f93abf3cad4f%3A0xac0632e37c9ca628!2sBucure%C8%99ti!5e0!3m2!1sro!2sro!4v1668671160953!5m2!1sro!2sro';
    const mapFrame: RefObject<HTMLIFrameElement> = useRef<HTMLIFrameElement>(null);
    const [isFrameLoading, setIsFrameLoading] = useState(true);

    const onFrameLoadHandler = function () {
        setIsFrameLoading(false);
    };
    return (
        <>
            <h3>Contact page</h3>
            <hr />
            {isFrameLoading && (
                <>
                    <div className={'d-flex justify-content-center'}>
                        <Spinner color={'primary'} size={'x-lg'} />
                        <h2>Map is loading...</h2>
                    </div>
                </>
            )}
            <div>
                <Row noGutters={true}>
                    <Col sm={12} md={12} lg={6} className={'rounded-1'}>
                        <iframe
                            onLoad={onFrameLoadHandler}
                            ref={mapFrame}
                            src={URL}
                            width='400'
                            height='400'
                            style={{ border: 0 }}
                            allowFullScreen={true}
                            loading='lazy'
                            referrerPolicy='no-referrer-when-downgrade'
                        ></iframe>
                    </Col>
                    {!isFrameLoading && (
                        <>
                            <Col sm={12} md={12} lg={6} className={'rounded-1'}>
                                <h1>Test</h1>
                            </Col>
                        </>
                    )}
                </Row>
            </div>
        </>
    );
};

export default InstitutionsPage;
